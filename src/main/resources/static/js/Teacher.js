$( document ).ready(function() {
    // SUBMIT FORM =====================================================
    $("#teacherForm").submit(function(event) {
        event.preventDefault();
        newTeacher();
    });
    function newTeacher(){
        // PREPARE FORM DATA
        var formData = {
            name : $("#name").val(),
            surname : $("#surname").val(),
            email : $("#email").val(),
            phone : $("#phone").val()
            // subject : {
            //     name : $("#name").val(),
            //     numberOf : $("#numberOf").val()
            // }
        };
        // SAVE =====================================================
        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : window.location + "teacher/save",
            data : JSON.stringify(formData),
            success : function(teacher) {
                $("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" +
                    "Save Successfully! <br>" +
                    "--> {name: " + teacher.name +
                    ", surname: " + teacher.surname +
                    ", email: " + teacher.email +
                    ", phone: " + teacher.phone + "}</p>");
                console.log("Saved teacher:",teacher);
            },
            error : function(e) {
                alert("Error!");
                console.log("ERROR: ", e);
            }
        });
        // Reset FormData after saving ==========================
        resetForm();
    }
    function resetForm(){
        $("#name").val("");
        $("#surname").val("");
        $("#email").val("");
        $("#phone").val("");
    }
    // GET REQUEST ============================================================
    $("#getAllTeacherId").click(function(event){
        event.preventDefault();
        getAllTeacher();
    });
    getAllTeacher();
    // GET  ALL ============================================================
    function getAllTeacher() {
        $.ajax({
            type : "GET",
            url : window.location + "teacher/all",
            success: function(teacherList){
                $('#teacherTable tbody').empty();
                $.each(teacherList, function(index, teacher){
                    var teacherRow = '<tr>' +
                        '<td>' + index + '</td>' +
                        '<td>' + teacher.name + '</td>' +
                        '<td>' + teacher.surname + '</td>' +
                        '<td>' + teacher.email + '</td>' +
                        '<td>' + teacher.phone + '</td>' +
                        '<td class="text-center">' +
                        '<input type="hidden" value=' + teacher.id + '>' +
                        '<a>' +
                        '<span class="glyphicon glyphicon-remove"></span>' +
                        '</a>' +
                        '</td>' +
                        '</tr>';
                    $('#teacherTable tbody').append(teacherRow);
                });
                $( "#teacherTable tbody tr:odd" ).addClass("info");
                $( "#teacherTable tbody tr:even" ).addClass("success");
                console.log("Get teacher list:",teacherList);
            },
            error : function(e) {
                alert("ERROR: ", e);
                console.log("ERROR: ", e);
            }
        });
    }
    // Do DELETE ============================================================
    $(document).on("click","a",function() {
        var teacherId = $(this).parent().find('input').val();
        var workingObject = $(this);
        $.ajax({
            type : "DELETE",
            url : window.location + "/teacher/del/" + teacherId,
            success: function(){
                $("#resultMsgDiv").html("<p style='background-color:#67597E; color:white; padding:20px 20px 20px 20px'>" +
                    "Teacher with Id=" + teacherId + " is deleted successfully!"  +
                    "</p>");
                workingObject.closest("tr").remove();
                console.log("Deleted Teacher id: ",teacherId);
            },
            error : function(e) {
                alert("ERROR: ", e);
                console.log("ERROR: ", e);
            }
        });
    });
//    =======================================================================================================
    ajaxGet();

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : window.location + "/teacher/all",
            success: function(result){
                $.each(result, function(i, teacher){

                    // render a teacher data form
                    var teacherInfo = '<form id=custform_' + teacher.id + ' class="form-inline" style="margin-top:20px;margin-bottom:20px">' +
                        '<div class="form-group">'	+
                        '<label style="margin-left:10px; margin-right:5px">Id: </label>'	+
                        '<input name="teacherId" type="text" class="form-control" value=' + teacher.id  + ' disabled >' +
                        '</div>' +
                        '<div class="form-group">'	+
                        '<label style="margin-left:10px; margin-right:5px">Name: </label>'	+
                        '<input name="name" type="text" class="form-control"  value=' + teacher.name + ' disabled >' +
                        '</div>' +
                        '<div class="form-group" style="display: none;">' +
                        '<label style="margin-left:5px; margin-right:5px">Lastname: </label>' +
                        '<input name="surname" type="text" class="form-control"  value=' + teacher.surname +'>' +
                        '</div>' +
                        '<div class="form-group" style="display: none;">' +
                        '<label style="margin-left:5px; margin-right:5px">email: </label>' +
                        '<input name="email" type="text" class="form-control"  value=' + teacher.email +'>' +
                        '</div>' +
                        '<div class="form-group" style="display: none;">' +
                        '<label style="margin-left:5px; margin-right:5px">phone: </label>' +
                        '<input name="phone" type="text" class="form-control"  value=' + teacher.phone +'>' +
                        '</div>' +
                        '<button type="submit" class="btn btn-default" style="margin-left:10px">Select</button>'
                    '</form>';

                    $('#teacherlist .list-group').append(teacherInfo)

                    // default fill data of the first teacher to update-form
                    if(i==0){
                        $("#updateFormCustId").val(teacher.id);
                        $("#updateFormName").val(teacher.name);
                        $("#updateFormSurname").val(teacher.surname);
                        $("#updateFormEmail").val(teacher.email);
                        $("#updateFormPhone").val(teacher.phone);
                    }

                });
                console.log("Success: ", result);
            },
            error : function(e) {
                $("#teacherlist").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });
    }
//    ==============================================================================
    $(document).on('submit', 'form', function (e) {
        event.preventDefault();
        fillDetailsToUpdateForm($(this));
    })

    $("#customizedForm").submit(function(){
        event.preventDefault();
        ajaxPut();
    });

    function fillDetailsToUpdateForm(object){
        var custId = $(object).find("input[name='teacherId']").val();
        var name = $(object).find("input[name='name']").val();
        var surname = $(object).find("input[name='surname']").val();
        var email = $(object).find("input[name='email']").val();
        var phone = $(object).find("input[name='phone']").val();

        $("#updateFormCustId").val(custId);
        $("#updateFormName").val(name);
        $("#updateFormSurname").val(surname);
        $("#updateFormEmail").val(email);
        $("#updateFormPhone").val(phone);
    }

    /*
     * AJAX PUT updated-form
     */
    function ajaxPut(){
        // PREPARE FORM DATA
        var formData = {
            id: $("#updateFormCustId").val(),
            name : $("#updateFormName").val(),
            surname : $("#updateFormSurname").val(),
            email : $("#updateFormEmail").val(),
            phone : $("#updateFormPhone").val()
        };

        var id = $("#updateFormCustId").val();

        console.log("formData before PUT: " + formData);

        // DO PUT
        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : window.location + "teacher/save",// + id,
            data : JSON.stringify(formData),

            // SUCCESS response
            success : function(teacher) {
                // Create successful messsurname
                $("#putResultDiv").html("<p style='background-color:#67597E; color:white; padding:20px 20px 20px 20px'>" +
                    "Put Successfully! <br>" +
                    "--> {id: " + teacher.id +
                    "name: " + teacher.name +
                    ", surname: " + teacher.surname +
                    ", email: " + teacher.email +
                    ", phone: " + teacher.phone +"}</p>");

                // Again fill data to Update-Form
                $("#updateFormCustId").val(teacher.id);
                $("#updateFormName").val(teacher.name);
                $("#updateFormSurname").val(teacher.surname);
                $("#updateFormEmail").val(teacher.email);
                $("#updateFormPhone").val(teacher.phone);

                // Update name of the updated teacher on Teacher List
                $('#custform_' + teacher.id).find("input[name='name']").val(teacher.name);
                $('#custform_' + teacher.id).find("input[name='surname']").val(teacher.surname);
                $('#custform_' + teacher.id).find("input[name='email']").val(teacher.email);
                $('#custform_' + teacher.id).find("input[name='phone']").val(teacher.phone);
            },

            // ERROR response
            error : function(e) {
                alert("Error!");
                console.log("ERROR: ", e);
            }
        });
    }
//    ==============================================================================


});
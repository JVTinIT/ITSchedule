//package notes;
//
//import com.ITSchedule.models.Subject;
//import com.ITSchedule.models.Teacher;
//
//import java.text.DateFormatSymbols;
//import java.util.Locale;
//
//public class n2{
//	public static void main(String[] args) {
//		Teacher teacher1 = new Teacher();
//		Teacher teacher2 = new Teacher();
//		Teacher teacher3 = new Teacher();
//		Teacher teacher4 = new Teacher();
////=======new Subjects=====================
//		Subject java = new Subject("java",1);
//		Subject STRPP = new Subject("STRPP",1);
//		Subject project = new Subject("project",6);
//		Subject web = new Subject("web",2);
//		Subject less = new Subject("less",1);
//		Subject js = new Subject("js",1);
//		Subject php = new Subject("php",1);
//		Subject laravel = new Subject("laravel",1);
////=========setSubjectList=============
///*t1*/	teacher1.setSubjectList(java);
///*t2*/	teacher2.setSubjectList(STRPP);
//		teacher2.setSubjectList(project);
///*t3*/  teacher3.setSubjectList(web);
//		teacher3.setSubjectList(less);
//		teacher3.setSubjectList(js);
///*t4*/	teacher4.setSubjectList(php);
//		teacher4.setSubjectList(laravel);
////===========setWorkTimeOptions==========
///*t1*/	teacher1.setWorkTimeOptions(1,5);
//		teacher1.setWorkTimeOptions(2,5);
///*t2*/	teacher2.setWorkTimeOptions(2,5);
//		teacher2.setWorkTimeOptions(6,3);
///*t3*/	teacher3.setWorkTimeOptions(3,4);
//		teacher3.setWorkTimeOptions(1,5);
//		teacher3.setWorkTimeOptions(3,6);
//		teacher3.setWorkTimeOptions(4,1);
//		teacher3.setWorkTimeOptions(2,5);
///*t4*/	teacher4.setWorkTimeOptions(1,5);
//		teacher4.setWorkTimeOptions(5,5);
//		teacher4.setWorkTimeOptions(2,1);
//		System.out.println("t1:  "+teacher1.getSubjectList());
//		System.out.println("\tdays"+teacher1.getWorkTimeOptions());
//		System.out.println("t2:  "+teacher2.getSubjectList());
//		System.out.println("\tdays"+teacher2.getWorkTimeOptions());
//		System.out.println("t3:  "+teacher3.getSubjectList());
//		System.out.println("\tdays"+teacher3.getWorkTimeOptions());
//		System.out.println("t4:  "+teacher4.getSubjectList());
//		System.out.println("\tdays"+teacher4.getWorkTimeOptions());
//
////		DateFormatSymbols week = new DateFormatSymbols(new Locale("en","RU"));
////		String[] weekDays = week.getWeekdays();
////		for(String weekDay : weekDays)
////			System.out.print("   "+weekDay);
////		System.out.println("      Mon    Tue    Wed    Thu    Fri    Sat    Sun\n");
//		System.out.println("    | Monday | Tuesday|WednesdayThursday| Friday |Saturday| Sunday |");
//
//		for(int i=1;i<=7;i++){
//			System.out.print("L:"+i+":|");
//			for(int j=1;j<=7;j++){
//				int space = 4;
//				if(teacher1.getWorkTimeOptions().contains(j+""+i)){
//					System.out.print("t1");
//					--space;
//				}
//				if(teacher2.getWorkTimeOptions().contains(j+""+i)){
//					System.out.print("t2");
//					--space;
//				}
//				if(teacher3.getWorkTimeOptions().contains(j+""+i)){
//					System.out.print("t3");
//					--space;
//				}
//				if(teacher4.getWorkTimeOptions().contains(j+""+i)){
//					System.out.print("t4");
//					--space;
//				}
//				for(;space>0;space--)
//					System.out.print("  ");
//				System.out.print("|");
//			}
//			System.out.println();
//		}
//	}
//}

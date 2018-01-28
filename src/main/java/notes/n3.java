package notes;

import com.ITSchedule.models.Teacher;
import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.lang.reflect.Array;
import java.util.Calendar.*;

import java.util.*;



public class n3{
	private Map<Integer,List<Integer>> wto = new HashMap<>();
	public static void main(String[] args) {
		Teacher t = new Teacher();
//		t.setWorkTimeOptions(1,1);
//		t.setWorkTimeOptions(1,4);
//		t.setWorkTimeOptions(1,4);
//		t.setWorkTimeOptions(3,5);
		System.out.println(t.getWorkTimeOptions());
//		List<Integer> lessons = new ArrayList<>();
//		lessons.add(1);
//		lessons.add(2);
//		lessons.add(3);
//
//		wto.put(1,lessons);
//		System.out.println(wto);
	}

}

import java.util.ArrayList;
import kr.inflearn.ObjectArray;
import kr.tpc.*;

public class TPC37 {
	public static void main(String[] args) {
		// ObjectArray arr = new ObjectArray(5); // 5개의 값만 대입 가능
		ArrayList arr = new ArrayList(5); // 배열의 길이에 제약 X
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		
		for (int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i);
			if (o instanceof A) {
				((A)o).go();
			} else {
				((B)o).go();
			}
		}
	}
}
import kr.tpc.*;

public class TPC32 {
	public static void main(String[] args) {
		// Oracle, MySQL -> Driver Class
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "root", "ABCDEF");
	}
}
import java.util.Scanner;
public class Cal {
  public static void main(String[] args) {
		//数字入力ー＞四則演算選ぶー＞解答出力 
		
		//1, 数字の入力(n)
		//2, 四則演算の入力（+, -, ÷,  *)
		//3,　数字入力(m)
		//4, 計算方法の決定(+ or - or / or *)
		//5, n,mの計算の出力
		
		System.out.print("数字を入力してください");
		Scanner sc = new Scanner(System.in);
		
		//整数nの受け取り
		double n = sc.nextInt();
		
		//四則演算の方法の受け取り
		String c = sc.next();
		
		//整数mの受け取り
		double m = sc.nextInt();
		
		System.out.print((int)n);
		System.out.print(c);
		System.out.print((int)m);
		
		System.out.println("");
		//comメソッドの計算結果の出力
		System.out.println(com(n,m,c));
		
		}
	
	//演算するプログラム
	public static double com(double n, double m, String c) {
		double ans = 0;
		
		/*cに+,-,/,*が含まれている場合はcの値に応じて計算の実行、含まれていない場合はエラーメッセージを出力後、プログラム終了
		 * 
		 */
		if(c.equals("+")) {
			ans = n + m;
		}else if(c.equals("-")) {
			ans = n - m;
		}else if(c.equals("/")) {
			ans = n / m;
		}else if(c.equals("*")) {
			ans = n * m;
		}else {
			System.out.println("入力エラー");
			System.exit(0);
		}
		return ans;
	}
}

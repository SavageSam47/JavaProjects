
public class towersofannoying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// smallest disk- 0 medium - 1 large - 2
		oof(4,1,2,3);
	}
	public static void oof(int disk,int startpeg,int spare,int dest) {
		if (disk==1) {
			System.out.println("Move disk " + disk + " from peg " + startpeg + " to peg " + dest);
		}
		else {
			oof(disk-1, startpeg, dest, spare);
			System.out.println("Move disk " + disk + " from peg " + startpeg + " to peg " + dest);
			oof(disk-1, spare, startpeg, dest);

		}
	}
}
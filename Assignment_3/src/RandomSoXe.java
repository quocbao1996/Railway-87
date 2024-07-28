import java.util.Random;
import java.util.Scanner;

public class RandomSoXe {

	public static void main(String[] args) {
		baitap();

	}
	public static void baitap() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int socuoi = random.nextInt(99999);
		
		String alphabet [] = {"A","B","c","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int length = alphabet.length;
		int chuso = random.nextInt(length);
		
		int cumhanoi [] = {29,30,31,32};
		int hanoi = random.nextInt(cumhanoi.length);
		int cumhcm [] = {50,51,52,53,54,55,56,57,58,59};
		int hcm = random.nextInt(cumhcm.length);
		
		System.out.println("Hãy nhập vào tên tỉnh (không dấu)");
		String name = scanner.nextLine();
		String tinh = name.trim().toLowerCase();
		System.out.printf("Biển số xe của tỉnh %S là: %n",name);
		if(tinh.equals("cao bang")) {
			System.out.println("11" + alphabet[chuso]);
		} else if (tinh.equals("lang son")) {
			System.out.println("12" + alphabet[chuso]);
		}else if (tinh.equals("bac giang")) {
			System.out.println("13" + alphabet[chuso]);
		}else if (tinh.equals("quang ninh")) {
			System.out.println("14" + alphabet[chuso]);
		}else if (tinh.equals("hai phong")) {
			System.out.println("15" + alphabet[chuso]);
		}else if (tinh.equals("thai binh")) {
			System.out.println("17" + alphabet[chuso]);
		}else if (tinh.equals("nam dinh")) {
			System.out.println("18" + alphabet[chuso]);
		}else if (tinh.equals("phu tho")) {
			System.out.println("19" + alphabet[chuso]);
		}else if (tinh.equals("thai nguyen")) {
			System.out.println("20" + alphabet[chuso]);
		}else if (tinh.equals("yen bai")) {
			System.out.println("21" + alphabet[chuso]);
		}else if (tinh.equals("tuyen quang")) {
			System.out.println("22" + alphabet[chuso]);
		}else if (tinh.equals("ha giang")) {
			System.out.println("23" + alphabet[chuso]);
		}else if (tinh.equals("lao cai")) {
			System.out.println("24" + alphabet[chuso]);
		}else if (tinh.equals("lai chau")) {
			System.out.println("25" + alphabet[chuso]);
		}else if (tinh.equals("son la")) {
			System.out.println("26" + alphabet[chuso]);
		}else if (tinh.equals("dien bien")) {
			System.out.println("27" + alphabet[chuso]);
		}else if (tinh.equals("hoa binh")) {
			System.out.println("28" + alphabet[chuso]);
		}else if (tinh.equals("ha noi")) {
			System.out.printf("%d%s%n",cumhanoi[hanoi],alphabet[chuso]);
		}else if (tinh.equals("ha tay")) {
			System.out.println("33" + alphabet[chuso]);
		}else if (tinh.equals("hai duong")) {
			System.out.println("34" + alphabet[chuso]);
		}else if (tinh.equals("ninh binh")) {
			System.out.println("35" + alphabet[chuso]);
		}else if (tinh.equals("thanh hoa")) {
			System.out.println("36" + alphabet[chuso]);
		}else if (tinh.equals("nghe an")) {
			System.out.println("37" + alphabet[chuso]);
		}else if (tinh.equals("ha tinh")) {
			System.out.println("38" + alphabet[chuso]);
		}else if (tinh.equals("da nang")) {
			System.out.println("43" + alphabet[chuso]);
		}else if (tinh.equals("dac lac")) {
			System.out.println("47" + alphabet[chuso]);
		}else if (tinh.equals("dak lak")) {
			System.out.println("47" + alphabet[chuso]);
		}else if (tinh.equals("dac nong")) {
			System.out.println("48" + alphabet[chuso]);
		}else if (tinh.equals("lam dong")) {
			System.out.println("49" + alphabet[chuso]);
		}else if (tinh.equals("hcm")) {
			System.out.printf("%d%s%n",cumhcm[hcm], alphabet[chuso]);
		}else if (tinh.equals("tp hcm")) {
			System.out.printf("%d%s%n",cumhcm[hcm], alphabet[chuso]);
		}else if (tinh.equals("dong nai")) {
			System.out.println("60" + alphabet[chuso]);
		}else if (tinh.equals("binh duong")) {
			System.out.println("61" + alphabet[chuso]);
		}else if (tinh.equals("long an")) {
			System.out.println("62" + alphabet[chuso]);
		}else if (tinh.equals("tien giang")) {
			System.out.println("63" + alphabet[chuso]);
		}else if (tinh.equals("vinh long")) {
			System.out.println("64" + alphabet[chuso]);
		}else if (tinh.equals("can tho")) {
			System.out.println("65" + alphabet[chuso]);
		}else if (tinh.equals("dong thap")) {
			System.out.println("66" + alphabet[chuso]);
		}else if (tinh.equals("an giang")) {
			System.out.println("67" + alphabet[chuso]);
		}else if (tinh.equals("kieng giang")) {
			System.out.println("68" + alphabet[chuso]);
		}else if (tinh.equals("ca mau")) {
			System.out.println("69" + alphabet[chuso]);
		}else if (tinh.equals("tay ninh")) {
			System.out.println("70" + alphabet[chuso]);
		}else if (tinh.equals("ben tre")) {
			System.out.println("71" + alphabet[chuso]);
		}else if (tinh.equals("ba ria - vung tau")) {
			System.out.println("72" + alphabet[chuso]);
		}else if (tinh.equals("ba ria  vung tau")) {
				System.out.println("72" + alphabet[chuso]);
		}else if (tinh.equals("quang binh")) {
			System.out.println("73" + alphabet[chuso]);
		}else if (tinh.equals("quang tri")) {
			System.out.println("74" + alphabet[chuso]);
		}else if (tinh.equals("thua - thien hue")) {
			System.out.println("75" + alphabet[chuso]);
		}else if (tinh.equals("thua thien hue")) {
			System.out.println("75" + alphabet[chuso]);
		}else if (tinh.equals("quang ngai")) {
			System.out.println("76" + alphabet[chuso]);
		}else if (tinh.equals("binh dinh")) {
			System.out.println("77" + alphabet[chuso]);
		}else if (tinh.equals("phu yen")) {
			System.out.println("78" + alphabet[chuso]);
		}else if (tinh.equals("khanh hoa")) {
			System.out.println("79" + alphabet[chuso]);
		}else if (tinh.equals("gia lai")) {
			System.out.println("81" + alphabet[chuso]);
		}else if (tinh.equals("kon tum")) {
			System.out.println("82" + alphabet[chuso]);
		}else if (tinh.equals("soc trang")) {
			System.out.println("83" + alphabet[chuso]);
		}else if (tinh.equals("tra vinh")) {
			System.out.println("84" + alphabet[chuso]);
		}else if (tinh.equals("ninh thuan")) {
			System.out.println("85" + alphabet[chuso]);
		}else if (tinh.equals("binh thuan")) {
			System.out.println("86" + alphabet[chuso]);
		}else if (tinh.equals("vinh phuc")) {
			System.out.println("88" + alphabet[chuso]);
		}else if (tinh.equals("hung yen")) {
			System.out.println("89" + alphabet[chuso]);
		}else if (tinh.equals("ha nam")) {
			System.out.println("90" + alphabet[chuso]);
		}else if (tinh.equals("quang nam")) {
			System.out.println("92" + alphabet[chuso]);
		}else if (tinh.equals("binh phuoc")) {
			System.out.println("93" + alphabet[chuso]);
		}else if (tinh.equals("bac lieu")) {
			System.out.println("94" + alphabet[chuso]);
		}else if (tinh.equals("hau giang")) {
			System.out.println("95" + alphabet[chuso]);
		}else if (tinh.equals("bac can")) {
			System.out.println("97" + alphabet[chuso]);
		}else if (tinh.equals("bac ninh")) {
			System.out.println("99" + alphabet[chuso]);
		}else {
			System.out.println("Mời bạn nhập đúng tên tỉnh");
			return;
		}
		
		
		if(socuoi < 9999 ) {
			System.out.println("0"+socuoi);
		}else if(socuoi <999) {
			System.out.println("00"+socuoi);
		}else if(socuoi <99) {
			System.out.println("0000"+socuoi);
		}else if (socuoi <9){
			System.out.println("00000"+socuoi);
		}else {
			System.out.printf("%,d",socuoi);
		}
	}
}

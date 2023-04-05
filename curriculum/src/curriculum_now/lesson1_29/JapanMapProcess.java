package curriculum_now.lesson1_29;

import java.util.Map;

public class JapanMapProcess extends JapanBean{
	public void japan(Map<Integer, String> map) {
		JapanBean jp = new JapanBean();

		for(int i = 0;i < map.size();i++) {
			String[] txt = map.get(i).split(":");
			jp.setName(txt[0]);
			jp.setPrefecturalCapital(txt[1]);
			jp.setWidth(Double.parseDouble(txt[2]));
			speak(jp);
		}
	}
	public void speak(JapanBean jp) {
		System.out.println("都道府県名：" + jp.getName());
		System.out.println("県庁所在地：" + jp.getPrefecturalCapital());
		System.out.println("面積：" + jp.getWidth() + "km2");
		System.out.println();
	}
}

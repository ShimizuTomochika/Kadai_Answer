package curriculum_now.lesson1_29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JapanMap {
	protected Map<Integer,String> nameInfo(List<Integer> key) {

		Map<Integer,String> name = new HashMap<>();
		Map<Integer,String> names = new HashMap<>();

		//key 数字 value 都道府県:県庁所在地:面積
		name.put(0, "北海道:札幌市:83424");
		name.put(1, "青森県:青森市:9646");
		name.put(2, "岩手県:盛岡市:15275");
		name.put(3, "宮城県:仙台市:7282");
		name.put(4, "秋田県:秋田市:11638");
		name.put(5, "山形県:山形市:9323");
		name.put(6, "福島県:福島市:13784");
		name.put(7, "茨城県:水戸市:6097");
		name.put(8, "栃木県:宇都宮市:6408");
		name.put(9, "群馬県:前橋市:6362");
		name.put(10, "埼玉県:さいたま市:3798");

		Iterator<Integer> it = key.iterator();
		for(int i = 0;i < key.size();i++) {
			names.put(i, name.get(it.next()));
		}
		return names;
	} 
}

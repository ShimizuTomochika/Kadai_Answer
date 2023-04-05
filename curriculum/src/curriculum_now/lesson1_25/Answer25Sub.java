package curriculum_now.lesson1_25;

 public class Answer25Sub {
	 private int hp = 0;
	 private int mp = 0;
	 private int str = 0;
	 private int agi = 0;
	 private int def = 0;
	 
	 public void hello(String sp) {
		 System.out.println("こんにちは 「 " + sp + " 」 さん");
	 }
	 
	 public void status() {
			System.out.println("ステータス");
			System.out.println("HP：" + this.getHp());
			System.out.println("MP：" + this.getMp());
			System.out.println("攻撃力：" + this.getStr());
			System.out.println("素早さ：" + this.getAgi());
			System.out.println("防御力：" + this.getDef());
			System.out.println();
			System.out.println("さあ冒険に出かけよう！");
	}
	 
	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}


	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}


	/**
	 * @return mp
	 */
	public int getMp() {
		return mp;
	}


	/**
	 * @param mp セットする mp
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}


	/**
	 * @return str
	 */
	public int getStr() {
		return str;
	}


	/**
	 * @param str セットする str
	 */
	public void setStr(int str) {
		this.str = str;
	}


	/**
	 * @return agi
	 */
	public int getAgi() {
		return agi;
	}


	/**
	 * @param agi セットする agi
	 */
	public void setAgi(int agi) {
		this.agi = agi;
	}


	/**
	 * @return def
	 */
	public int getDef() {
		return def;
	}


	/**
	 * @param def セットする def
	 */
	public void setDef(int def) {
		this.def = def;
	}
}
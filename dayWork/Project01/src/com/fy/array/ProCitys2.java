package com.fy.array;
/**
 * 通过省份去得到对应的城市
 * @author cly
 * @date 2023年12月1日
 */
public class ProCitys2 {

	public static void main(String[] args) {
		String [] pros = {"江苏省","安徽省"};
		//江苏省城市
		String [] city = {"南京","无锡"};
		//安徽省
		String [] city2 = {"合肥","芜湖"};
		
		//以对应省份取对应城市
		for(int i = 0 ; i < pros.length ; i++){
				if (pros[i].equals("江苏省")) {
					for(int j = 0 ; j < city.length ; j++){
						System.out.println(pros[i]+"的城市:"+city[j]);
					}	
				}
				//System.out.println("-------------------------------------");
				if (pros[i].equals("安徽省")) {
					for(int z = 0 ; z < city2.length ; z++){
						System.out.println(pros[i]+"的城市:"+city2[z]);
					}
				}
		}
	}

}

package com.study.wotk;
/**
 * 数组的嵌套使用
 * @author cly
 * @date 2023年12月5日
 */
public class TestOtherArrayPro {

	public static void main(String[] args) {
		/**
		 * 步骤:
		 * 1.定义若干数组
		 * 2.使用双重for循环,外层循环用来遍历主数组值
		 * 3.进行条件判断,若符合条件,则进入内层for循环,输出副数组值
		 */
		String city[] = {"幻想乡","红魔馆","白玉楼"};
		String js[] = {"灵梦","魔理沙"};
		String js2[] = {"芙兰朵露","蕾米莉亚"};
		String js3 [] = {"妖梦","幽幽子"};
		for(int i = 0 ; i < city.length ; i++){
			if (city[i].equals("幻想乡")) {
				for(int j = 0 ; j < js.length ; j++){
					System.out.println(city[i]+"的角色是:"+js[j]);
				}
			}
			else if (city[i].equals("红魔馆")) {
				for(int k = 0 ; k < js2.length ; k++){
					System.out.println(city[i]+"的角色是:"+js2[k]);
				}
			}
		}
		
	}

}

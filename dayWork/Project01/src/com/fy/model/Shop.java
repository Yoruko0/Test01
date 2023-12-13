package com.fy.model;
/**
 * 商品类(商品表:对应持久层里的表中的表名与字段名称)
 * @author cly
 * @date 2023年12月12日
 */
public class Shop {
		//商品名称
		String shopName;
		//价格
		double price;
		//库存数量
		int num;
		//是否购买
		boolean buy ;
		
		//boolean类型:get方式,以is开头	
		//赋值:set开头
		public void  setShopName(String shopName){
			      this.shopName = shopName;
		}
		
		
		
		public void setPrice(double price) {
			this.price = price;
		}



		public void setNum(int num) {
			this.num = num;
		}



		public void setBuy(boolean buy) {
			this.buy = buy;
		}
		
		public void shopNameInfo(){
			System.out.println("商品名称:"+shopName+",商品价格:"+price+",库存数量:"+num);
		}
		//boolean类型:set或get方式,is开头
}

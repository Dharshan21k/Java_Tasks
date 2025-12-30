package Generics;

public class EampleGenerics<type1,type2>{
	type1 dataType;
	type2 dataType2;
	EampleGenerics(type1 dataType,type2 dataType2){
		this.dataType=dataType;
		this.dataType2=dataType2;
	}
	public type1 getDataType() {
			return dataType;
	}
	public type2 getDataType2() {
		return dataType2;
}
	public static void main(String main[]) {
		EampleGenerics<String,Integer> obj=new EampleGenerics<>("Dharshan",2);
		System.out.println("the String data:"+obj.getDataType());
		System.out.println("the Integer data:"+obj.getDataType2());
		
		
	
	
	}

}

package ist242;

public class Store {

	private String storename;

	public Store(String newStoreName){
		storename = newStoreName;
	}

	public String getStorename(){
		return this.storename;
	}

	public void setStorename(String newStoreName){
	this.storename = newStoreName;
	}

}


class TV{
	public void switched()
	{
		System.out.println("TV is Switched ON ");
	}
	
	public void changeChannel()
	{
		System.out.println("TV channel is Changes ");
	}
}

class SmartTV extends TV{
	@Override
	public void switched()
	{
		System.out.println("SmartTV is Switched ON ");
	}
	
	@Override
	public void changeChannel()
	{
		System.out.println("SmartTV channel is Changes ");
	}
	
	public void browse()
	{
		System.out.println("Smart TV Browsing");
	}
}


public class overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TV t =new SmartTV();
         t.switched();
         t.changeChannel();
         
//         SmartTV t1= new SmartTV();
//         t1.switched();
//         t1.browse();
	}

}

import java.awt.*;
class Checkboxx{
	Checkboxx(){
		Frame f=new Frame();
		Checkbox c1=new Checkbox("Struggle");
		         c1.setBounds(100,100,80,50);
        
        Checkbox c2=new Checkbox("Continue");
                 c2.setBounds(100,150,80,50);

         f.add(c1);
         f.add(c2);
         f.setLayout(null);
         f.setSize(400,400);
         f.setVisible(true);

	}
	public static void main(String[] args) {
		new Checkboxx();
	}
}
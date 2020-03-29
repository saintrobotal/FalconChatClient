package FalconChat;

public class InitProg 
{
	public static ClientContact cc;
	public static ClientForm cf;
	public static ClientMainForm cmf;
	public static void main(String[] args)
	{
		cc = new ClientContact();
		cf = new ClientForm();//LoginForm
		cmf = new ClientMainForm();
		cf.setVisible(true);
		cmf.setVisible(false);
		cc.setVisible(false);
	}
	
}

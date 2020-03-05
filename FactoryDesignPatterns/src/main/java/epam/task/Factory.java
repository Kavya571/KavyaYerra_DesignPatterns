package epam.task;
import com.epam.task.OperatingSystemFactory;
import com.epam.task.Android;
import com.epam.task.IOS;
import com.epam.task.OS;
import com.epam.task.Windows;


public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");//here we can use Closed instead of Open the we get the IOS 
		obj.spec();
	}

}

package hs.mirim0312;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

//public class ClickButtonActivity extends Activity implements OnClickListener{//��ư�� �۵��ϰ� �ϱ����� implements���ش�
public class ClickButtonActivity extends Activity{

	//1. ����
	Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//main.xml�� activity�� �����
        
        //2. ���
         button = (Button)findViewById(R.id.button1);
           //findViewById�� activity���� �˷���
        
        //3. ������ �ֱ�->��ư�� ������ �ൿ�ϰ� ��.
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(ClickButtonActivity.this, "�غ�(�ضߴ� ��)�̴� �쵿(����� �ܿ�)�̴�~~~", 3000).show();
				// TODO Auto-generated method stub
				
			}
		});
        
    } //onCreate
    
/*    @Override
    public void onClick(View v) {
    	// TODO Auto-generated method stub
    	
    	Toast.makeText(this, "������� ����̴�~~~", 3000).show();
    	
    }*/
    
}
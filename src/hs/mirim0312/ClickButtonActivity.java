package hs.mirim0312;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

//public class ClickButtonActivity extends Activity implements OnClickListener{//버튼을 작동하게 하기위해 implements해준다
public class ClickButtonActivity extends Activity{

	//1. 선언
	Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//main.xml과 activity를 얹어줌
        
        //2. 찍기
         button = (Button)findViewById(R.id.button1);
           //findViewById가 activity한테 알려줌
        
        //3. 리스너 주기->버튼이 눌릴때 행동하게 함.
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(ClickButtonActivity.this, "해봄(해뜨는 봄)이는 우동(비오는 겨울)이다~~~", 3000).show();
				// TODO Auto-generated method stub
				
			}
		});
        
    } //onCreate
    
/*    @Override
    public void onClick(View v) {
    	// TODO Auto-generated method stub
    	
    	Toast.makeText(this, "너희들은 행운이다~~~", 3000).show();
    	
    }*/
    
}
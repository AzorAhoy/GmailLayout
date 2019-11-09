package com.example.gmaillayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<mailModel> mails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mails = new ArrayList<>();
        mails.add(new mailModel("Edurila.com","$19 Only(First 10 spots)..","Are you looking to Learn..", R.drawable.pic01_small,"12:34 PM"));
        mails.add(new mailModel("Chris Abad","Help make Campaign Mo.." ,"Let us khow your thoughts..", R.drawable.pic02_small,"11:22 AM"));
        mails.add(new mailModel("Tuto.com","8h de formation gratuite..","Photoshop,CEO,Blender,C..", R.drawable.pic03_small,"11:04 AM"));
        mails.add(new mailModel("support","Société Ovh: suivi de vos ..", "SAS OVH - http://www.ovh..", R.drawable.pic04_small,"10:26 AM"));
        mails.add(new mailModel("Matt from lonic", "The New lonic Creator Is..","Announcing the all-new C..", R.drawable.pic05_small,"11:11 PM"));
        mails.add(new mailModel("Anivia", "(Không có chủ đề)","Slide_AnNinhMang.rar", R.drawable.pic06_small,"11:23 PM"));
        mails.add(new mailModel("Neeko", "Experience enjoyable JavaScript ...","Experience enjoyable JavaScript development with WebStorm..", R.drawable.pic07_small,"9:07 AM"));
        mails.add(new mailModel("Google", "Thông báo bảo mật","Thiết bị mới đã đăng nhập..", R.drawable.pic08_small,"8:17 AM"));
        mails.add(new mailModel("tôi", "xử lý tín hiệu số ","tvl_slide.pdf", R.drawable.pic09_small,"1:23 AM"));
        mails.add(new mailModel("Trường Đại Học..", "Reset mật khẩu","Chào Hoàng Công Hậ..", R.drawable.pic10_small,"3:05 PM"));
       /* contacts.add(new ContactModel("User11", "user11@localhost", R.drawable.thumb11));
        contacts.add(new ContactModel("User12", "user12@localhost", R.drawable.thumb12));
        contacts.add(new ContactModel("User13", "user13@localhost", R.drawable.thumb13));
        contacts.add(new ContactModel("User14", "user14@localhost", R.drawable.thumb14));
        contacts.add(new ContactModel("User15", "user15@localhost", R.drawable.thumb15));*/

        ListView listView = findViewById(R.id.list);
        CustomIconLabelAdapter adapter = new CustomIconLabelAdapter(mails, this);
        listView.setAdapter(adapter);
    }
}

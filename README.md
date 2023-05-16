<body>
    <table border="1">
        <tr>
            <th> Nama</th>
            <th>NIM</th>
            <th>Kelas</th>
        </tr>
        <tr>
            <td>Ahmad Syukron</td>
            <td>312110056</td>
            <td>TI.21.A.1</td>
        </tr>
    </table>
</body>

# UTS Mobile
## Tampilan dari Aplikasi Cloud

### Penjelasan
- Disini saya menggunakan <b>android studio</b> untuk pembuatan project saya

![image](Image/Screenshot%202023-05-15%20095131.png)


- Ada 3 layout yang saya buat dalam pembuatan project kali ini.
1. <b> Activity_login</b>
2. <b> Activity_main</b>
3. <b> Activity_register</b>
<p>

Sorce code:

1. <b> Activity_login</b>
```bash
 <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RegisterActivity"
    android:backgroundTint="@color/background">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/rectangle_1">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/gambar1"
            android:layout_alignParentTop="true"
            android:layout_alignParentLeft="true"
            android:id="@+id/L_img_1"/>

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/ic_back"
            android:layout_marginLeft="16dp"
            android:layout_marginTop="16dp"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/L_img_1"
            android:text="Welcome Back"
            android:layout_centerHorizontal="true"
            android:fontFamily="@font/poppinssemibold"
            android:textSize="18dp"
            android:textColor="@color/black"
            android:id="@+id/L_txt_1"/>

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/L_txt_1"
            android:src="@drawable/login"
            android:id="@+id/L_img_2"
            android:layout_marginTop="10dp"
            android:layout_centerHorizontal="true"/>


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_below="@id/L_img_2"
            android:padding="30dp"
            android:id="@+id/L_ly_1">

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:layout_marginTop="10dp"
                android:hint="Enter Your Email"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:fontFamily="@font/poppinsregular"
                android:id="@+id/edt_email"
                android:textSize="18sp"/>

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:layout_marginTop="10dp"
                android:hint="Confirm Password"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:fontFamily="@font/poppinsregular"
                android:id="@+id/edt_conf_password"
                android:textSize="18sp"/>

        </LinearLayout>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login"
            android:layout_below="@id/L_ly_1"
            android:layout_centerHorizontal="true"
            android:background="@drawable/button_shape"
            android:width="300dp"
            android:textColor="@color/white"
            android:textSize="18sp"
            android:id="@+id/L_btn_1"
            android:fontFamily="@font/poppinsbold"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_below="@id/L_btn_1"
            android:gravity="center"
            android:layout_marginTop="20dp">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Not have an account?"
                android:fontFamily="@font/poppinsregular"
                android:textSize="12sp"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Register"
                android:fontFamily="@font/poppinsbold"
                android:textSize="12sp"
                android:id="@+id/txt_register"
                android:textColor="@color/SecondaryColor"/>

        </LinearLayout>
    </RelativeLayout>

</RelativeLayout>
```

2. <b> Activity_main</b>
```bash
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/rectangle_1">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/gambar1"
            android:layout_alignParentTop="true"
            android:layout_alignParentLeft="true"
            android:id="@+id/img_1"/>

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/gambar2"
            android:layout_below="@+id/img_1"
            android:layout_centerHorizontal="true"
            android:id="@+id/img_2"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/img_2"
            android:text="CLOUD Server"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="12dp"
            android:fontFamily="@font/poppinsbold"
            android:textSize="18sp"
            android:textColor="@color/black"
            android:id="@+id/txt_1"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/txt_1"
            android:gravity="center"
            android:padding="20dp"
            android:text="computer data storage in which digital data is stored in logical collections. Physical storage includes multiple servers, and the physical environment is usually owned and managed by the hosting company."
            android:fontFamily="@font/poppinsregular"
            android:textColor="@color/black"
            android:id="@+id/txt_2"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_marginTop="25dp"
            android:layout_height="wrap_content"
            android:layout_below="@id/txt_2"
            android:width="300dp"
            android:text="Login"
            android:layout_centerHorizontal="true"
            android:background="@drawable/button_shape"
            android:textColor="@color/white"
            android:textSize="14dp"
            android:fontFamily="@font/poppinsbold"
            android:id="@+id/btn_1"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_marginTop="10dp"
            android:layout_height="wrap_content"
            android:layout_below="@id/btn_1"
            android:width="300dp"
            android:text="Register"
            android:layout_centerHorizontal="true"
            android:background="@drawable/button_shape"
            android:textColor="@color/white"
            android:textSize="14dp"
            android:fontFamily="@font/poppinsbold"
            android:id="@+id/btn_2"/>
    </RelativeLayout>

</RelativeLayout>

```
1. <b> Activity_register</b>
```bash
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RegisterActivity"
    android:backgroundTint="@color/background">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/rectangle_1">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/gambar1"
            android:layout_alignParentTop="true"
            android:layout_alignParentLeft="true"
            android:id="@+id/R_img_1"/>

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/ic_back"
            android:layout_marginLeft="16dp"
            android:layout_marginTop="16dp"
            android:id="@+id/R_img_2"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/R_img_1"
            android:text="Welcome Onboard"
            android:layout_centerHorizontal="true"
            android:fontFamily="@font/poppinssemibold"
            android:textSize="18dp"
            android:textColor="@color/black"
            android:id="@+id/R_txt_1"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/R_txt_1"
            android:text="Let’s help you meet up your tasks."
            android:layout_centerHorizontal="true"
            android:fontFamily="@font/poppinsregular"
            android:textSize="12dp"
            android:textColor="@color/black"
            android:layout_marginTop="10dp"
            android:id="@+id/R_txt_2"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_below="@id/R_txt_2"
            android:padding="30dp"
            android:id="@+id/ly_1">

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:hint="Enter Your Full Name"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:id="@+id/edt_fullname"
                android:textSize="18sp"
                android:fontFamily="@font/poppinsregular"/>

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:layout_marginTop="10dp"
                android:hint="Enter Your Email"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:fontFamily="@font/poppinsregular"
                android:id="@+id/edt_email"
                android:textSize="18sp"/>

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:layout_marginTop="10dp"
                android:hint="Create Password"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:fontFamily="@font/poppinsregular"
                android:id="@+id/edt_password"
                android:textSize="18sp"/>

            <EditText
                android:layout_width="match_parent"
                android:layout_height="57dp"
                android:background="@drawable/button_shape"
                android:layout_marginTop="10dp"
                android:hint="Confirm Password"
                android:paddingLeft="10dp"
                android:backgroundTint="@color/white"
                android:fontFamily="@font/poppinsregular"
                android:id="@+id/edt_conf_password"
                android:textSize="18sp"/>

        </LinearLayout>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Register"
            android:layout_below="@id/ly_1"
            android:layout_centerHorizontal="true"
            android:background="@drawable/button_shape"
            android:width="300dp"
            android:textColor="@color/white"
            android:textSize="18sp"
            android:id="@+id/R_btn_1"
            android:fontFamily="@font/poppinsbold"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_below="@id/R_btn_1"
            android:gravity="center"
            android:layout_marginTop="20dp">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Already have an account?"
                android:fontFamily="@font/poppinsregular"
                android:textSize="12sp"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login"
                android:fontFamily="@font/poppinsbold"
                android:textSize="12sp"
                android:id="@+id/txt_login"
                android:textColor="@color/SecondaryColor"/>

        </LinearLayout>
    </RelativeLayout>

</RelativeLayout>
```

- <b>App yang digunakan</b>
![image](Image/Screenshot%202023-05-15%20101534.png)

### Hasil
![image](Image/Screenshot%202023-05-15%20102337.png)<p>
![image](Image/Screenshot%202023-05-15%20102504.png)<p>
![image](Image/Screenshot%202023-05-15%20102548.png)




# END
![Gambar 13](Image/anime-love.gif)
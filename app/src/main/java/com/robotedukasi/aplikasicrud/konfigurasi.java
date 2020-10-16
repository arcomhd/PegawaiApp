package com.robotedukasi.aplikasicrud;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    //public static String BASE_URL = "http://android.komangsugiartha.com";
    public static String BASE_URL = "http://192.168.64.2/pegawai";
    public static final String URL_ADD= BASE_URL + "/tambahpgw.php";
    public static final String URL_GET_ALL = BASE_URL + "/tampilsemuapgw.php";
    public static final String URL_GET_EMP = BASE_URL + "/tampilpgw.php?id=";
    public static final String URL_UPDATE_EMP = BASE_URL + "/updatepgw.php";
    public static final String URL_DELETE_EMP = BASE_URL + "/hapuspgw.php?id=";


    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";


    public static final String TAG_POSISI = "position";
    public static final String TAG_GAJIH = "salary";



    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "position"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih



    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}

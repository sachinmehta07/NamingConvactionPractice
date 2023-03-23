package com.example.namingconvactionpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalogClock aclockDisplayTime;
        AutoCompleteTextView actvSearchProduct;
        Button btnSave;
        Button btnUserRegister;
        Button btnLogin;
        Button btnSignUp;
        Button btnSend;
        Button btnOrder;

        //CalendarView Select
        CalendarView calSelectDate;
        CalendarView calSelectMonth;
        CalendarView calSelectYear;

        //checkBox of Selecting Hobby
        CheckBox chbCricket;
        CheckBox chbFootball;
        CheckBox chbGym;
        CheckBox chbSwimming;

        //checkBox of Selecting Multiple Lang
        CheckBox chbPhp;
        CheckBox chbJava;
        CheckBox chbPython;
        CheckBox chbAndroid;

        //Select Item From Multiple List
        CheckedTextView chtvAdhaarCard;
        CheckedTextView chtvPanCard;
        CheckedTextView chtvVoterIdCard;
        CheckedTextView chtvDrivingLicence;

        EditText edtUserName;
        EditText edtUserPassword;
        EditText edtSearchBar;
        EditText edtSearchItem;

        //GridLayout
        GridLayout glProductList;
        GridLayout glShirtList;
        GridLayout glMovieList;

        HorizontalScrollView hsvIntroImageScroll;
        HorizontalScrollView hsvDisplayAvlItem;

        ImageButton imbTapImageProduct;
        ImageButton imbTapImageDetails;
        //ims - ImageSwitcher

        ImageView imvSplashBgImage;
        ImageView imvIntroBgImage;
        ImageView imvDashBordBgImage;
        ImageView imvProductOneImage;

        LinearLayout llSearchLay;
        LinearLayout llActionBar;

//        lsv - ListView
//        ctlr - MediaController
//        mactv - MultiAutoCompleteTextView
//        np - NumberPicker
//        pm - PopupMenu

        PopupWindow pwDisplayStationList;
        PopupWindow pwDisplayAvlOption;

        ProgressBar pgbImageDownload;
        RadioGroup rgSelectOption;
        RadioButton rbVeg;
        RadioButton rbNonVeg;

        RatingBar rtbProductRating;
        RelativeLayout rlSearch;

        //rv - RemoteViews
        ScrollView scvListOfImages;
        //schv - SearchView
        SeekBar skbCustomVolumeSet;
        SeekBar skbProductPriceFilter;

        //sapCopyToClipBord
        //sapShareButt- ShareActionProvider

        Spinner spnListOfCountry;
        Spinner spnListOfAvlDocuments;


//        stv - StackView
//        sw - Switch
//        tabh - TabHost
//        tabc - TabHost

        TableLayout tlWhatsappTab;

//        tr - TableRow
//        twg - TabWidget
//        tclock - TextClock
//        tsw - TextSwitcher

        TextView txvUserNameDisplay;
        TextView txvUserDetails;
        TextView txvProductPrice;
        TextView txvProductName;

        TimePicker tpSetAlarmTime;
        Toast toastDisplayNoInternettMsg;
        Toast toastErrorUserNameIncorrect;


        ToggleButton tgAlarmSet;
        ToggleButton tgAlarmOff;
        ToggleButton tgDarkMode;
        ToggleButton tgNormalMode;

        RecyclerView rvChat;
        RecyclerView rvStatus;
        RecyclerView rvCall;

        RecyclerView rvContactList;
        RecyclerView rvProductList;
        RecyclerView rvLanguageSelection;


    }
}
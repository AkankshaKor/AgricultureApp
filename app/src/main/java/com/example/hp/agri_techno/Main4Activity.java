package com.example.hp.agri_techno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent in2=getIntent();

        TextView tv1=(TextView) findViewById(R.id.textView2);
        tv1.setText("Where can I purchase fertilizers and pesticides? How do I select the right ones?\nAns. Service Centres of State agro industries, corporations and State commodity federations and agricultural extension centres.Farmer Service centres of National Agricultural Cooperative Marketing Federation of India or NAFED and Indian Farmers Fertilizer Cooperative Limited or IFFCO.\n");

        TextView tv2=(TextView) findViewById(R.id.textView3);
        tv2.setText("What is crop insurance?\nAns. Crop insurance, like home or car insurance, is a risk management tool used by farmers. If there are extreme weather conditions or drastic market changes that affect a farmer, crop insurance enables them to recover financially. This allows farmers to continue their operation in the event of a loss. Without crop insurance, it would be nearly impossible for operations to pay their debts after they experienced a significant event that damaged their crops.");

        TextView tv3=(TextView) findViewById(R.id.textView4);
        tv3.setText("What is an e-Choupal ? How is it useful to farmers?\nAns. An e-Choupal is a service offered to farmers by ITC to help them work their way around market intermediaries and weak infrastructure.It is basically a computer with internet facility that allows users to access the e-Choupal website run by ITC.Farmers use the computer to access daily closing prices of local mandis, international prices as well as details about new farming techniques. ");

        TextView tv4=(TextView) findViewById(R.id.textView5);
        tv4.setText("How do I reduce financial risk to my farm from natural disasters like floods or drought?\nAns. The simplest way to reduce the risk of floods or drought for farmers is to take out a crop insurance policy. In India, the Agriculture Insurance Company of India (External website that opens in a new window) (AIC) is exclusively responsible for implementing the National Agricultural Insurance Scheme (External website that opens in a new window) or NAIS. ");

        TextView tv5=(TextView) findViewById(R.id.textView6);
        tv5.setText("Is there any facility for the farmer to get the seed tested before sowing?\nAns. Seed users and seed producers could get the seed sample tested in the State Seed Testing Laboratories with the minimum fee prescribed to obtain the result to be used as information for seeding, selling or labeling purposes.");

        TextView tv6=(TextView) findViewById(R.id.textView7);
        tv6.setText("How do I start a Floriculture, Sericulture or Aquaculture business?\nAns. The Ministry of Agriculture, Government of India, in association with NABARD has launched the AgriBusiness Centre programme to take better farming methods to each and every farmer in India. According to this scheme, agriculture graduates can set up their own AgriBusiness Centres to offer professional extension services to local farmers. The government also provides business free start up training to graduates in agriculture and allied subjects like horticulture, sericulture, veterinary sciences, forestry, dairy, poultry farming, and fisheries. Those who complete the training can apply for special start-up loans to finance their business.");

        TextView tv7=(TextView) findViewById(R.id.textView8);
        tv7.setText("Where do I find the latest agricultural machinery?\nAns. Farm machines and equipment play a pivotal role in crop production, harvesting, transportation, processing and preservation. In 1955, the government established the 'Agricultural Machinery Utilization Training Centre' at Budni, Madhya Pradesh to promote the use of machinery in agriculture. This centre was later renamed the 'Central Farm Machinery Training and Testing Institute.This institute is involved in testing the latest imported farm machinery and training farmers on their proper use, maintenance and up-keep.");

        TextView tv8=(TextView) findViewById(R.id.textView9);
        tv8.setText("What is the course content of different government farmer training programmes? How is it beneficial?\nAns. The Department of Agriculture of different States is responsible for conducting training programmes for farmers in their region. These programmes teach farmers about the packages of practice for crops in their region as well as enumerate new scientific technologies for production and marketing.Krishi Vigyan Kendras or KVKs are local level organizations dedicated to teaching skill oriented programmes to farmers, rural youth and women.");

        TextView tv9=(TextView) findViewById(R.id.textView10);
        tv9.setText("To whom the farmers have to approach when the seed fail to perform?\nAns. Director of Agriculture/Joint Director of Agriculture/Seed Inspector of the areas concerned.If a variety is registered under PPV&FR Act, 2001 and if it fails to give expected performance under given conditions then the farmers can approach the Authority under Section 39(2) of PPV&FR Act, 2001 claiming compensation.");

        TextView tv10=(TextView) findViewById(R.id.textView11);
        tv10.setText("What is the import duty for different agricultural products?\nAns. Wheat grains have an import duty of 100 per cent; rice has a duty of 80 per cent while the rate for maize is 70 per cent. Grains like rye, barley, oats, buckwheat and canary seed may be imported for free. Soybeans, groundnut, linseed, sunflower seeds, cottonseeds, mustard seeds and the like have an import duty of 35 per cent. Coffee and Tea has a standard duty of 100 per cent. Spices like black pepper, cardamom, chilly and cloves have a duty rate of 70 per cent.");
    }
}

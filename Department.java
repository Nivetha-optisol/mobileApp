package com.example.madrasmedicalmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        ListView listView;
        listView = (ListView) findViewById(R.id.listview);
        String[] data = new String[25];
        data[0] = "Department of Nuclear Medicine";
        data[1] = "Department of Radiology";
        data[2] = "Center for Genetic Studies & Research";
        data[3] = "Department of Microbiology";
        data[4] = "Department of Biochemistry";
        data[5] = "The Department of Histopathology & Cytology";
        data[6] = "Department of Transfusion Medicine";
        data[7] = "The Department Of Nutrition & Dietetics";
        data[8] = "Department of Pastoral Care & Medical Social Work";
        data[9] = "Department of Physical Medicine";
        data[10] = "Department of Community medicine";
        data[11] = "Department of Urology";
        data[12] = "Department of Fertility";
        data[13] = "Department of Phycologist";
        data[14] = "Department of Neurologist";
        data[15] = "Department of Cardiology";
        data[16] = "Department of Dermatologist";
        data[17] = "Department of Ortho";
        data[18] = "Department of Diapetist ";
        data[19] = "Department of Pediatrician";
        data[20] = "Department of Histopathology";
        data[21] = "Department of Maternity";
        data[22] = "Department of Oncology";
        data[23] = "Department of BoneMarrowTransplant";
        data[24] = "Department of Obstetrics";
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, data);
        listView.setAdapter(adapter);
    }
}

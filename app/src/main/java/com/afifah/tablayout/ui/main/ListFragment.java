package com.afifah.tablayout.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.afifah.tablayout.R;
import com.afifah.tablayout.model.Fruit;
import com.afifah.tablayout.ui.adapter.FruitArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    FruitArrayAdapter fruitArrayAdapter;
    ListView listView;
    int colorIndex;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_layout, container, false);
        fruitArrayAdapter = new FruitArrayAdapter(requireContext(), R.layout.listview_layout);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(fruitArrayAdapter);
        colorIndex = 0;

        List<String[]> fruitList = readData();
        for(String[] fruitData:fruitList ) {
            String fruitImg = fruitData[0];
            String fruitName = fruitData[1];
            String calories = fruitData[2];
            int fruitImgResId = getResources().getIdentifier(fruitImg, "drawable", "com.afifah.tablayout");

            Fruit fruit = new Fruit(fruitImgResId, fruitName, calories);
            fruitArrayAdapter.add(fruit);
        }

        return view;
    }

    public List<String[]> readData(){
        List<String[]> resultList = new ArrayList<>();

        String[] fruit1 = new String[3];
        fruit1[0] = "cherry";
        fruit1[1] = "Cherry";
        fruit1[2] = "50 Calories";
        resultList.add(fruit1);

        String[] fruit2 = new String[3];
        fruit2[0] = "strawberry";
        fruit2[1] = "Strawberry";
        fruit2[2] = "33 Calories";
        resultList.add(fruit2);

        String[] fruit3 = new String[3];
        fruit3[0] = "banana";
        fruit3[1] = "Banana";
        fruit3[2] = "89 Calories";
        resultList.add(fruit3);

        String[] fruit4 = new String[3];
        fruit4[0] = "apple";
        fruit4[1] = "Apple";
        fruit4[2] = "52 Calories";
        resultList.add(fruit4);

        String[] fruit7 = new String[3];
        fruit7[0] = "orange";
        fruit7[1] = "Orange";
        fruit7[2] = "47 Calories";
        resultList.add(fruit7);

        String[] fruit5 = new String[3];
        fruit5[0] = "pear";
        fruit5[1] = "Pear";
        fruit5[2] = "57 Calories";
        resultList.add(fruit5);

        String[] fruit6 = new String[3];
        fruit6[0] = "lemon";
        fruit6[1] = "Lemon";
        fruit6[2] = "29 Calories";
        resultList.add(fruit6);

        String[] fruit8 = new String[3];
        fruit8[0] = "peach";
        fruit8[1] = "Peach";
        fruit8[2] = "39 Calories";
        resultList.add(fruit8);

        String[] fruit9 = new String[3];
        fruit9[0] = "apricot";
        fruit9[1] = "Apricot";
        fruit9[2] = "48 Calories";
        resultList.add(fruit9);

        String[] fruit10 = new String[3];
        fruit10[0] = "kiwi";
        fruit10[1] = "Kiwi";
        fruit10[2] = "61 Calories";
        resultList.add(fruit10);

        String[] fruit11 = new String[3];
        fruit11[0] = "mango";
        fruit11[1] = "Mango";
        fruit11[2] = "60 Calories";
        resultList.add(fruit11);

        return  resultList;
    }

}

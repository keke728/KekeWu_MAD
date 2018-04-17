package com.example.keke.babyface.UI;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.keke.babyface.R;

import java.util.List;


public class BodyPartFragment extends Fragment {

    //Tag for logging
    private static final String TAG = "BodyPartFragment";

    //Variables to store a list of image resources and the the index of the image that fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    //Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){

    }

    /**
     * Inflates the fragment layout and sets any image resource
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatnce) {

        //Inflates the project fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        //Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //If a list of image ids exists, set the image resource to the correct item in that list
        //Otherwise, create a log statement that indicates that the list was not found
        if(mImageIds !=null){
            //Set the image resource to the list item at the stored index
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            //Log a message saying the image id list if null
            Log.v(TAG, "This fragment has a null list of image ids");
        }

        //Return root view
        return rootView;
    }


    // Setter methods for keeping track of the list images this fragment can display and which image
    // in the list if currently being displayed

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }
    public void setmListIndex(int index){
        mListIndex = index;
    }
}



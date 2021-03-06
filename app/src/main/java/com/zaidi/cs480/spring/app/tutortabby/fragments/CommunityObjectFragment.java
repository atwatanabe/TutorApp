package com.zaidi.cs480.spring.app.tutortabby.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zaidi.cs480.spring.app.tutortabby.R;

/**
 * Placeholder object, not really needed, only to prevent runtime errors if more fragments are added.
 */
public class CommunityObjectFragment extends Fragment {
  public static final String ARG_OBJECT = "object";

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_community_object, container, false);
    Bundle args = getArguments();
    ((TextView) rootView.findViewById(android.R.id.text1)).setText(
            Integer.toString(args.getInt(ARG_OBJECT)));

    return rootView;
  }
}
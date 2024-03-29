package com.example.dashboard3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link f5.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link f5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class f5 extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public f5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment f1.
     */
    // TODO: Rename and change types and number of parameters
    public static f5 newInstance(String param1, String param2) {
        f5 fragment = new f5();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton1:
                f1 fragmento1 = new f1();
                FragmentTransaction transition = getFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmento1);
                transition.commit();
                break;
            case R.id.imageButton2:
                f2 fragmento2 = new f2();
                FragmentTransaction transition1 = getFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragmento2);
                transition1.commit();
                break;
            case R.id.imageButton3:
                f3 fragmento3 = new f3();
                FragmentTransaction transition3 = getFragmentManager().beginTransaction();
                transition3.replace(R.id.contenedor, fragmento3);
                transition3.commit();
                break;
            case R.id.imageButton4:
                f4 fragmento4 = new f4();
                FragmentTransaction transition4 = getFragmentManager().beginTransaction();
                transition4.replace(R.id.contenedor, fragmento4);
                transition4.commit();
                break;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f5, container, false);
        ImageButton btnfr1 = (ImageButton)v.findViewById(R.id.imageButton1);
        ImageButton  btnfr2 = (ImageButton)v.findViewById(R.id.imageButton2);
        ImageButton  btnfr3 = (ImageButton)v.findViewById(R.id.imageButton3);
        ImageButton  btnfr4 = (ImageButton)v.findViewById(R.id.imageButton4);
        btnfr2.setOnClickListener(this);
        btnfr1.setOnClickListener(this);
        btnfr3.setOnClickListener(this);
        btnfr4.setOnClickListener(this);

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

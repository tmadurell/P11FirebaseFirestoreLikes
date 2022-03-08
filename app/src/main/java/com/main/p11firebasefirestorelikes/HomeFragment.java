package com.main.p11firebasefirestorelikes;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.navigation.*;

import android.os.Bundle;
import android.view.*;


public class HomeFragment extends Fragment {

    NavController navController;   // <-----------------

    public HomeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);  // <-----------------
    }
}
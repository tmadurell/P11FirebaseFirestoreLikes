package com.main.p11firebasefirestorelikes;

import android.os.Bundle;

import androidx.annotation.*;
import androidx.fragment.app.*;
import androidx.navigation.*;
import android.view.*;
import android.widget.*;

import com.bumptech.glide.*;
import com.google.firebase.auth.*;


public class ProfileFragment extends Fragment {
    //8. Perfil de usuario
    NavController navController;   // <-----------------
    ImageView photoImageView;
    TextView displayNameTextView, emailTextView;

    public ProfileFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        photoImageView = view.findViewById(R.id.photoImageView);
        displayNameTextView = view.findViewById(R.id.displayNameTextView);
        emailTextView = view.findViewById(R.id.emailTextView);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null){
            displayNameTextView.setText(user.getDisplayName());
            emailTextView.setText(user.getEmail());

            Glide.with(requireView()).load(user.getPhotoUrl()).into(photoImageView);
        }
    }
}
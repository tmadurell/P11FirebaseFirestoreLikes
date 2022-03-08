package com.main.p11firebasefirestorelikes;

import android.os.Bundle;

import androidx.annotation.*;
import androidx.fragment.app.*;
import androidx.navigation.*;
import android.view.*;

import com.google.android.gms.auth.api.signin.*;
import com.google.firebase.auth.FirebaseAuth;


public class SignOutFragment extends Fragment {

    NavController navController;   // <-----------------

    public SignOutFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_out, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        GoogleSignIn.getClient(requireActivity(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .build()).signOut();

        FirebaseAuth.getInstance().signOut();

        Navigation.findNavController(view).navigate(R.id.signInFragment);
    }
}
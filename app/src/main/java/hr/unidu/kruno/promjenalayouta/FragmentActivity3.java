package hr.unidu.kruno.promjenalayouta;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import androidx.fragment.app.Fragment;

public class FragmentActivity3 extends Fragment {
    private RatingBar pr;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.activity_fragment3, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        pr = view.findViewById(R.id.ratingBar);
        pr.setRating(4.5f);
    }

}
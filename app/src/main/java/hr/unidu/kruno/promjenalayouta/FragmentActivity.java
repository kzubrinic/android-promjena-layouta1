package hr.unidu.kruno.promjenalayouta;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentActivity extends Fragment {
    private TextView ime, prezime;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.activity_fragment, parent, false);

    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        ime = view.findViewById(R.id.ime);
        prezime = view.findViewById(R.id.prezime);
        ime.setText("Ana");
        prezime.setText("Anić");
    }

}

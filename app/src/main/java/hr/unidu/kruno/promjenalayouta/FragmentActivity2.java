package hr.unidu.kruno.promjenalayouta;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class FragmentActivity2 extends Fragment {
    private ImageView slika;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Povezuje XML datoteku fragmenta s Java kodom i vraća stvoreni view
        return inflater.inflate(R.layout.activity_fragment2, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        slika = view.findViewById(R.id.slika);
        // registrira se listener na pritisak na sliku
        slika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Pritisnuta slika!", Toast.LENGTH_LONG).show();
            }
        });
        // Učitava sliku iz drawable resursa na temelju njezinog naziva i prikazuje je
        slika.setImageDrawable(getResources().getDrawable(R.drawable.music_face));
    }

}
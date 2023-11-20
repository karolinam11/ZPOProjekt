import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.maligiganci.R
import com.google.firebase.auth.FirebaseAuth

class MakePlayer : AppCompatActivity() {
    private lateinit var changeProfilePictureButton: ImageButton
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_player)

        changeProfilePictureButton = findViewById(R.id.changeProfilePicture)

        // Inicjalizacja Firebase Authentication
        auth = FirebaseAuth.getInstance()

        changeProfilePictureButton.setOnClickListener {
            // Tutaj możesz dodać kod obsługujący kliknięcie przycisku.
            // Po naciśnięciu będzie losowało się zdjęcie z bazy danych
        }
    }
}

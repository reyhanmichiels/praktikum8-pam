package fat.mobile.tugasmodul8sqllite.ui;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import fat.mobile.tugasmodul8sqllite.database.Contact;
import fat.mobile.tugasmodul8sqllite.repository.ContactRepository;

public class ContactMainViewModel extends ViewModel {
    private final ContactRepository mContactRepository;

    public ContactMainViewModel(Application application) {
        mContactRepository = new ContactRepository(application);
    }

    LiveData<List<Contact>> getAllContacts(){
        return mContactRepository.getAllContacts();
    }
}

package fat.mobile.tugasmodul8sqllite.ui;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.ViewModel;

import fat.mobile.tugasmodul8sqllite.database.Contact;
import fat.mobile.tugasmodul8sqllite.repository.ContactRepository;

public class ContactInsertUpdateViewModel extends ViewModel {
    private final ContactRepository mContactRepository;

    public ContactInsertUpdateViewModel(Application application) {
        mContactRepository = new ContactRepository(application);
    }

    public void insert(Contact contact) {
        mContactRepository.insert(contact);
    }

    public void update(Contact contact) {
        mContactRepository.update(contact);
    }

    public void delete(Contact contact) {
        mContactRepository.delete(contact);
    }
}

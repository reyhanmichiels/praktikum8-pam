package fat.mobile.tugasmodul8sqllite.repository;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import fat.mobile.tugasmodul8sqllite.database.Contact;
import fat.mobile.tugasmodul8sqllite.database.ContactRoomDB;
import fat.mobile.tugasmodul8sqllite.database.DAOContact;

public class ContactRepository {
    private final DAOContact mDaoContact;
    private final ExecutorService executorService;

    public ContactRepository(Application application) {
        executorService = Executors.newSingleThreadExecutor();
        ContactRoomDB db = ContactRoomDB.getDatabase(application);
        mDaoContact = db.daoContact();
    }

    public LiveData<List<Contact>> getAllContacts(){
        return mDaoContact.getAllContacts();
    }

    public void insert(final Contact contact) {
        executorService.execute(() -> mDaoContact.insert(contact));
    }

    public void update(final Contact contact) {
        executorService.execute(() -> mDaoContact.update(contact));
    }

    public void delete(final Contact contact) {
        executorService.execute(() -> mDaoContact.delete(contact));
    }
}

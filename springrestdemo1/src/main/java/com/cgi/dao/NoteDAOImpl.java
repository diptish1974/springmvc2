package com.cgi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.Note;

@Repository
@Transactional
public class NoteDAOImpl implements NoteDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addNote(Note note) {
		    Session session=sessionFactory.getCurrentSession();
		    session.save(note);
	}

	public void deleteNote(int id) {
	

	}

	public void updateNote(Note note) {
		

	}

	public List<Note> getAllNotes() {
	
		return null;
	}

	public Note getNote(int id) {
		     
		return null;
	}

}

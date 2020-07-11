package com.dxc.hb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		
		
		
//		/*ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("India");
//		list1.add("Japan");
//		list1.add("China");
//		list1.add("USA");
//		
//		ArrayList<String> list2 = new ArrayList<String>();
//		list2.add("Java");
//		list2.add("C");
//		list2.add("HTML");
//		list2.add("CSS");*/
//		
//		/*HashSet<String> set1 = new HashSet<String>();
//		set1.add("India");
//		set1.add("Japan");
//		set1.add("China");
//		set1.add("USA");
//		
//		HashSet<String> set2 = new HashSet<String>();
//		set2.add("Java");
//		set2.add("C");
//		set2.add("HTML");
//		set2.add("CSS");*/
//		
//		HashMap<String,String> mMap1 = new HashMap<String,String>();
//		mMap1.put("1","India");
//		mMap1.put("2","Japan");
//		mMap1.put("3","China");
//		mMap1.put("4","USA");
//		
//		HashMap<String,String> mMap2 = new HashMap<String,String>();
//		mMap2.put("1","Java");
//		mMap2.put("2","C");
//		mMap2.put("3","HTML");
//		mMap2.put("4","CSS");
//		
//		Question question1 = new Question();
//		question1.setQuestionName("Which Country has Created Corona Virus ?");
////		question1.setAnswers(list1);
////		question1.setmSetAnswers(set1);
//		question1.setmMapAnswers(mMap1);
//		
//		Question question2 = new Question();
//		question2.setQuestionName("Which of the follwing is Object Oriented Programming Language (OOPS) ?");
////		question2.setAnswers(list2);
////		question2.setmSetAnswers(set2);
//		question1.setmMapAnswers(mMap2);
//		
//		session.save(question1);
//		session.save(question2);
//		
//		
//		// Fetching Data from DataBase for Set
//		TypedQuery query = session.createQuery("from Question");
//		List<Question> mQuestionList = query.getResultList();
//		
//		Iterator<Question> mIterator = mQuestionList.iterator();
//		while(mIterator.hasNext()) {
//			Question mQuestion = mIterator.next();
//			System.out.println("\nQuestion is \nQ: "+mQuestion.getQuestionName());
//			
//			// printing Answers for Set
//			/*Set<String> mSet = mQuestion.getmSetAnswers();
//			Iterator<String> mIterator1 = mSet.iterator();
//			while(mIterator1.hasNext())
//				System.out.println(mIterator.next());*/
//			
//			// printing Answers for Map
//		Map<String,String> mMap =  mQuestion.getmMapAnswers();
//			System.out.println(mMap.get("1"));
//			System.out.println(mMap.get("2"));
//			System.out.println(mMap.get("3"));
//			System.out.println(mMap.get("4"));
//		}
//		
		t.commit();
		session.close();
		factory.close();
				
	}
}

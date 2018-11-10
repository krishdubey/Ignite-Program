package com.iteritory.ignite.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.cache.Cache.Entry;
import javax.cache.integration.CacheLoaderException;
import javax.cache.integration.CacheWriterException;

import org.apache.ignite.cache.store.CacheStoreAdapter;
import org.apache.ignite.cache.store.CacheStoreSession;
import org.apache.ignite.resources.CacheStoreSessionResource;
import org.jetbrains.annotations.Nullable;

import com.iteritory.ignite.model.*;

public class OrdersCacheStoreAdapter extends CacheStoreAdapter<Long, Orders> {

	public Orders load(Long key) throws CacheLoaderException {
		// TODO Auto-generated method stub
		return null;
	}
	public void write(Entry<? extends Long, ? extends Orders> entry) throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}
	public void delete(Object key) throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}
 
}

package com.cts.soportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SOService {
	
	
		
		
		@Autowired
		SODao soDao;
		
	public void save(SODetail soDetail) {
			soDao.save(soDetail);
		}
		

		public MstrUser findByLoginId(String loginId) {
			return soDao.findByLoginId(loginId);
		}

		/*public List<MstrStatus> findByStatusType(String statusType) {
			// TODO Auto-generated method stub
			return soDao.findByStatusType(statusType);
		}*/

		

		public List<MstrStatus> findByStatusType(String statusType1, String statusType2) {
			return soDao.findByStatusType(statusType1, statusType2);
		}

		

		

		
		public List<MstrResourceLocation> findByLocation() {
			// TODO Auto-generated method stub
			return soDao.findByLocation();
		}

		public List<MstrLob> findByLob() {
			// TODO Auto-generated method stub
			return soDao.findByLob();
		}

		
		

		

		

	}



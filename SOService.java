package com.cts.soportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SOService {
	
	
		
		
		@Autowired
		SODao soDao;
		
	public void save(SODetail soDetail) {
		soDetail.setDay1(getdate(soDetail.getDay1()))
		soDetail.setDay2(getdate(soDetail.getDay2()))
			soDetail.setDay3(getdate(soDetail.getDay3()))
			soDao.save(soDetail);
		}
		
        public Date getdate(String dateinstring){
		Date dateinDate=new SimpleDateFormat("dd/MM/yyyy").parse(dateinstring);
		return dateinDate;
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



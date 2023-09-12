package com.xworkz.engineer.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {
	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_ITMES];
	private int position = 0;

	@Override
	public void save(EngineerDTO dto) {
		if (position < TOTAL_ITMES) {
			System.out.println("Invokin in the Repo");
			this.dtos[position] = dto;
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

	@Override
	public boolean isExist(EngineerDTO dto) {
		System.out.println("	Running in the ISEXIST"+getClass().getSimpleName());
		for(int index=0;index<=this.position;index++)
		{
			EngineerDTO ref=this.dtos[index];
			if(ref!=null&&ref.equals(dto)){
				System.out.println("Data already Exist");
				return true;
				
			}
			
		}
		return EngineerRepository.super.isExist(dto);
	}

}

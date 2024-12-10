package com.dailycodework.dreamshops.repository;

import com.dailycodework.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRespository extends JpaRepository<Image, Long> {
}

package in.priya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priya.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}

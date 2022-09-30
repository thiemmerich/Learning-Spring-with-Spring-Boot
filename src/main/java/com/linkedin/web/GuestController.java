package com.linkedin.web;

import java.util.List;

import com.linkedin.data.Guest;
import com.linkedin.data.GuestRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guests")
public class GuestController {

	private final GuestRepository guestRepository;

	public GuestController(GuestRepository guestRepository) {
		this.guestRepository = guestRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getReservations(Model model) {
		List<Guest> guests = this.guestRepository.findAll();

		model.addAttribute("guestList", guests);

		return "hotel-guests";
	}
}

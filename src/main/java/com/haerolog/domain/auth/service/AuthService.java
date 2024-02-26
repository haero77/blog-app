package com.haerolog.domain.auth.service;

import com.haerolog.domain.auth.service.port.SessionRepository;
import com.haerolog.domain.common.service.port.UuidHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final SessionRepository sessionRepository;
	private final UuidHolder uuidHolder;

	public String test() {
		return "aaa";
	}

}

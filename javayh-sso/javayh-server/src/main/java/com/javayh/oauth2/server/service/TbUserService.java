package com.javayh.oauth2.server.service;

import com.javayh.oauth.domain.TbUser;

public interface TbUserService {

	TbUser getByUsername(String username);

}

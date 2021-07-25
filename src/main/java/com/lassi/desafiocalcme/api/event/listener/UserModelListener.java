package com.lassi.desafiocalcme.api.event.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import com.lassi.desafiocalcme.api.model.Pessoa;
import com.lassi.desafiocalcme.api.service.SequenceGeneratorService;

public class UserModelListener extends AbstractMongoEventListener<Pessoa> {

	private SequenceGeneratorService sequenceGeneratorService;

	@Autowired
	public UserModelListener(SequenceGeneratorService sequenceGeneratorService) {
		this.sequenceGeneratorService = sequenceGeneratorService;
	}
	
	@Override
	public void onBeforeConvert(BeforeConvertEvent<Pessoa> event) {
	    if (event.getSource().getCodigo() < 1) {
	        event.getSource().setCodigo(sequenceGeneratorService.generateSequence(Pessoa.SEQUENCE_NAME));
	    }
	}

}

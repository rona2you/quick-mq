package com.bop.mq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author BOP
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel implements Serializable {

    private static final long serialVersionUID = 2323252406580323325L;

    private Integer id;
}


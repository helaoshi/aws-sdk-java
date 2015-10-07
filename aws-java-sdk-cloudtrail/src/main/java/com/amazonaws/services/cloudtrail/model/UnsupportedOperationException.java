/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This exception is thrown when the requested operation is not
 * supported. For example, this exception will occur if an attempt is
 * made to tag a trail and tagging is not supported in the current
 * region.
 * </p>
 */        
public class UnsupportedOperationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new UnsupportedOperationException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public UnsupportedOperationException(String message) {
        super(message);
    }
    
}
    